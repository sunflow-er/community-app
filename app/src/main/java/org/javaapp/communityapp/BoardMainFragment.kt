package org.javaapp.communityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.javaapp.communityapp.databinding.BoardMainRecyclerItemBinding
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
        boardMainFragmentBinding.boardMainToolbar.title = "게시판 이름"

        /*--------------------------------------------recycler View------------------------------------------------*/
        val boardMainRecyclerAdapter = BoardMainRecyclerAdapter()
        boardMainFragmentBinding.boardMainRecycler.adapter = boardMainRecyclerAdapter

        boardMainFragmentBinding.boardMainRecycler.layoutManager = LinearLayoutManager(requireContext())
        boardMainFragmentBinding.boardMainRecycler.addItemDecoration(DividerItemDecoration(requireContext(), 1))
        /*--------------------------------------------recycler View------------------------------------------------*/

        return boardMainFragmentBinding.root
    }

    /*--------------------------------------------recycler View------------------------------------------------*/
    inner class BoardMainRecyclerAdapter : RecyclerView.Adapter<BoardMainRecyclerAdapter.ViewHolderClass>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
            val boardMainRecyclerItemBinding = BoardMainRecyclerItemBinding.inflate(layoutInflater)
            val holder = ViewHolderClass (boardMainRecyclerItemBinding)

            val layoutParams = RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )

            boardMainRecyclerItemBinding.root.layoutParams = layoutParams
            boardMainRecyclerItemBinding.root.setOnClickListener(holder)

            return holder
        }

        override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {

        }

        override fun getItemCount(): Int {
            return 10
        }

        inner class ViewHolderClass(boardMainRecyclerItemBinding: BoardMainRecyclerItemBinding)
            : RecyclerView.ViewHolder(boardMainRecyclerItemBinding.root), View.OnClickListener {
            override fun onClick(v: View?) {

            }
        }
    }
    /*--------------------------------------------recycler View------------------------------------------------*/
}