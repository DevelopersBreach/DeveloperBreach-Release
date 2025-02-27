package com.developerbreach.developerbreach.ui.list
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.viewModels
//import androidx.navigation.fragment.findNavController
//import com.developerbreach.developerbreach.databinding.FragmentArticleListBinding
//import com.developerbreach.developerbreach.utils.RecyclerViewItemDecoration.Companion.setItemSpacing
//import java.util.concurrent.TimeUnit
//
//
//class ArticleListFragment : Fragment() {
//
//    private val viewModel: ArticleListViewModel by viewModels()
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val binding = FragmentArticleListBinding.inflate(inflater, container, false)
//        setItemSpacing(resources, binding.articlesRecyclerView)
//        setItemSpacing(resources, binding.categorySelectRecyclerView)
//        // Time taken for fragment to enter with transition
//        postponeEnterTransition(100L, TimeUnit.MILLISECONDS)
//        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment.
//        binding.lifecycleOwner = this
//        binding.viewModel = viewModel
//        binding.navController = findNavController()
//        binding.executePendingBindings()
//        return binding.root
//    }
//}