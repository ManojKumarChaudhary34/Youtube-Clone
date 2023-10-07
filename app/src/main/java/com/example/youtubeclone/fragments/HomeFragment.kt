package com.example.youtubeclone.fragments

import android.app.Application
import android.os.Bundle
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.youtubeclone.R
import com.example.youtubeclone.adapters.MyCategoryAdapter
import com.example.youtubeclone.adapters.MyVerticalAdapter
import com.example.youtubeclone.databinding.FragmentHomeBinding
import com.example.youtubeclone.models.CategoryDAta
import com.example.youtubeclone.models.VideoData


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var horizontalAdapter: MyCategoryAdapter
    private lateinit var categoryList: ArrayList<CategoryDAta>
    private lateinit var verticalAdapter: MyVerticalAdapter
    private lateinit var videoList: ArrayList<VideoData>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addDummyData()
        setUpRecyclerViewLayout()
       
    }

    private fun addDummyData() {
        categoryList = ArrayList<CategoryDAta>()
        categoryList.add(CategoryDAta("All"))
        categoryList.add(CategoryDAta("Popular"))
        categoryList.add(CategoryDAta("Android Development"))
        categoryList.add(CategoryDAta("Web Development"))
        categoryList.add(CategoryDAta("Songs"))
        categoryList.add(CategoryDAta("Hindi Songs"))
        categoryList.add(CategoryDAta("Videos"))
        categoryList.add(CategoryDAta("Bhojpuri Videos"))
        categoryList.add(CategoryDAta("Tharu Songs"))
        categoryList.add(CategoryDAta("Nepali Hits"))
        categoryList.add(CategoryDAta("Computer Programming"))
        categoryList.add(CategoryDAta("Java Basic"))
        categoryList.add(CategoryDAta("Favorite"))
        categoryList.add(CategoryDAta("C Programming"))

        videoList = ArrayList()
        videoList.add(
            VideoData(
                R.drawable.img9,
                R.drawable.img_2,
                "Learn How to Upload Video In Youtube",
                "30K Views·97K Likes"
            )
        )
        videoList.add(
            VideoData(
                R.drawable.img_7,
                R.drawable.img_1,
                "Chaleya Jawan Song Teaser | Shahrukh Khan | Nayanthara | Arijit Singh | Chaliya Song Jawan",
                "22.4K Views·607 Likes"
            )
        )
        videoList.add(
            VideoData(
                R.drawable.img_8,
                R.drawable.img_1,
                "Jawan Song Ishq | Shahrukh Khan | Deepika | Vijay Sethupathi | Srk Jawan Movie | Jawan Songs | 2023",
                "302K Views·2.97K Likes"
            )
        )
        videoList.add(
            VideoData(
                R.drawable.img,
                R.drawable.img,
                "How to learn to handshake with celebrity",
                "30K Views·97K Likes"
            )
        )
        videoList.add(
            VideoData(
                R.drawable.img_3,
                R.drawable.img_1,
                "Phir Kabhi Song By Sagar",
                "30K Views·97K Likes"
            )
        )
        videoList.add(
            VideoData(
                R.drawable.img_5,
                R.drawable.img_1,
                "Cover Song By Kishor Kumar | Zindgi Ka Safar",
                "33K Views·9K Likes"
            )
        )
        videoList.add(
            VideoData(
                R.drawable.img_4,
                R.drawable.img_1,
                "Most Popular Song | English Song",
                "300K Views·970K Likes"
            )
        )
    }

    private fun setUpRecyclerViewLayout() {
        setupHorizontalRecyclerView()
        setUpVerticalRecyclerView()
    }

    private fun setUpVerticalRecyclerView() {
        binding.verticalRecyclerView.layoutManager = LinearLayoutManager(this.context)
        binding.verticalRecyclerView.setHasFixedSize(true)
        binding.verticalRecyclerView.setItemViewCacheSize(13)
        verticalAdapter = MyVerticalAdapter(videoList)
        binding.verticalRecyclerView.adapter = verticalAdapter
    }

    private fun setupHorizontalRecyclerView() {
        binding.horizontalRecyclerView.layoutManager =
            LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        binding.horizontalRecyclerView.setHasFixedSize(true)
        binding.horizontalRecyclerView.setItemViewCacheSize(13)
        horizontalAdapter = MyCategoryAdapter(categoryList)
        binding.horizontalRecyclerView.adapter = horizontalAdapter

    }




}