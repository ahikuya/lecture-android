package com.ahikuya.androidproject01

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.ahikuya.androidproject01.databinding.ActivityMainBinding


/**
 * AppCompatActivity 클래스를 상속 받음.
 * AppCompatActivity 는 Activity를 상속 받음.
 * Ref : https://developer.android.com/reference/androidx/appcompat/app/AppCompatActivity
 */
class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding       // 뷰 레이아웃 바인딩 객체

    /**
     * 안드로이드 액티비티 생명주기 확인 : https://developer.android.com/guide/components/activities/activity-lifecycle?hl=ko
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)       // 뷰 바인딩 생성 및 변수에 할당.
        setContentView(binding.root)        // 레이아웃을 액티비티에 추가 및 출력

        // 액션바 사용 설정
        setSupportActionBar(binding.toolbar)

        // 참고 : https://developer.android.com/guide/navigation/navigation-ui?hl=ko
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
        // Navigation 사용 방법 참고 : https://codechacha.com/ko/android-navigation-basic/

        // FloatingActionButton에 클릭 이벤트 리스너 등록
        binding.fab.setOnClickListener { view ->
            // 스네이크바 생성하여 화면에 표시
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    /**
     * 옵션 메뉴 생성 콜백 함수
     */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    /**
     * 옵션 메뉴 선택 콜백 함수
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}