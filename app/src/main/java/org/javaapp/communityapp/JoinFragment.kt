package org.javaapp.communityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.javaapp.communityapp.databinding.FragmentJoinBinding

class JoinFragment : Fragment() {

    lateinit var joinFragmentBinding : FragmentJoinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        joinFragmentBinding = FragmentJoinBinding.inflate(inflater)
        joinFragmentBinding.joinToolbar.title = "회원가입"

        joinFragmentBinding.joinNextbtn.setOnClickListener {
            val act = activity as MainActivity
            act.fragmentController("nick_name", true, true)
        }

        return joinFragmentBinding.root
    }

}