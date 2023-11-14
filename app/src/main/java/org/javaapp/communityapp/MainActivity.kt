package org.javaapp.communityapp

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import org.javaapp.communityapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var currentFragment : Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        fragmentController("login", false, false) // 첫화면 -> 백스택 포함X ->  add == false
    }

    fun fragmentController(name : String, add : Boolean, animate : Boolean) {
        when(name) {
            "login" -> {
                currentFragment = LoginFragment()
            }
        }

        val trans = supportFragmentManager.beginTransaction()
        trans.replace(R.id.main_container, currentFragment) // 프래그먼트 전환

        if (add == true) {
            trans.addToBackStack(name) // name -> 특정 프래그먼트를 백스택에서 제거하기 용이 -> 이전으로 돌아가기 기능 만들 때 유용
        }

        if (animate == true) {
            trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        }

        trans.commit()
    }
}