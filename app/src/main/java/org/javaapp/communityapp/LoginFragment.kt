package org.javaapp.communityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.javaapp.communityapp.databinding.ActivityMainBinding
import org.javaapp.communityapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var loginFragmentBinding: FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        loginFragmentBinding = FragmentLoginBinding.inflate(inflater)
        loginFragmentBinding.loginToolbar.title = "로그인"

        loginFragmentBinding.loginJoinbtn.setOnClickListener {
            val act = activity as MainActivity // 프래그먼트를 소유하고 있는 액티비티 추출 (메인 액티비티로 변환)
            act.fragmentController("join", true, true)
        }

        return loginFragmentBinding.root
    }

}