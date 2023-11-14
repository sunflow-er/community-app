package org.javaapp.communityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.javaapp.communityapp.databinding.FragmentBoardMainBinding

class BoardMainFragment : Fragment() {

    lateinit var boardMainFragmentBinding : FragmentBoardMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        boardMainFragmentBinding = FragmentBoardMainBinding.inflate(inflater)

        return boardMainFragmentBinding.root
    }

}