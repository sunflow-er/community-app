package org.javaapp.communityapp

import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.javaapp.communityapp.databinding.FragmentBoardMainBinding
import org.javaapp.communityapp.databinding.FragmentBoardReadBinding

class BoardReadFragment : Fragment() {

    lateinit var boardReadFragmentBinding : FragmentBoardReadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        boardReadFragmentBinding = FragmentBoardReadBinding.inflate(inflater)
        boardReadFragmentBinding.boardReadToolbar.title = "게시플 읽기"

        val navIcon = requireContext().getDrawable(androidx.appcompat.R.drawable.abc_ic_ab_back_material)
        boardReadFragmentBinding.boardReadToolbar.navigationIcon = navIcon // 툴바에 홈버튼 설정
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) { // 홈버튼 색상 변경
            boardReadFragmentBinding.boardReadToolbar.navigationIcon?.colorFilter = BlendModeColorFilter(
                Color.parseColor("#FFFFFF"), BlendMode.SRC_ATOP)
        }
        else {
            boardReadFragmentBinding.boardReadToolbar.navigationIcon?.setColorFilter(
                Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP)
        }

        boardReadFragmentBinding.boardReadToolbar.setNavigationOnClickListener {
            var act = activity as BoardMainActivity
            act.fragmentRemoveBackStack("board_read")
        }

        return boardReadFragmentBinding.root
    }

}