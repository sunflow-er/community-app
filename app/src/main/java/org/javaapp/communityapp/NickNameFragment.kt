package org.javaapp.communityapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.javaapp.communityapp.databinding.FragmentNickNameBinding

class NickNameFragment : Fragment() {
    lateinit var nickNameFragmentBinding : FragmentNickNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        nickNameFragmentBinding = FragmentNickNameBinding.inflate(inflater)
        nickNameFragmentBinding.nicknameToolbar.title = "닉네임 입력"

        nickNameFragmentBinding.nicknameJoinBtn.setOnClickListener {
            val mainIntent = Intent(requireContext(), MainActivity::class.java)
            startActivity(mainIntent) // 액티비티 실행
            activity?.finish() // 현재 액티비티는 종료
        }

        return nickNameFragmentBinding.root
    }

}