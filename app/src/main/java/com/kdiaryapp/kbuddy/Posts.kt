package com.kdiaryapp.kbuddy

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
    TODO
        - This should be responsible for a separate screen loading users posts.
        It can be the main screen i.e., right after logging, or navigated to via the bottom navigation bar.
        The posts are surely gonna be via a time-consuming mockup code, to replicate real-life sencario, or even directly loading data from disk should also do the job for replicating Network IO.
 */

@OptIn(ExperimentalFoundationApi::class)
//@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Posts(
) {
//    Scaffold (
//        topBar = {
//            TextField(
//                value = "Search Posts",
//                onValueChange = {}
//            ) {
//
//            }
//        },
//        content = {},
//        bottomBar = { },
//        floatingActionButton = {},
//        snackbarHost = {},
//        drawerContent = {}
//        ) {
            // This lazy vertical grid should be the place holder for the posts that are to be loaded.
            var posts: List<String> = listOf("Post#1", "Post#2", "Post#3", "Post#4", "Post#5", "Post#5", "Post#6", "Post#7", "Post#8", "Post#9", "Post#10")
            var comments: List<String> = listOf("Comment#1", "Post#2", "Post#3", "Post#4", "Post#5", "Post#5", "Post#6", "Post#7", "Post#8", "Post#9", "Post#10")
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .wrapContentSize(align = Alignment.Center)
//                columns = GridCells.Fixed(2),
//                content =
            ) {
                stickyHeader { Text(text = "Posts") }
                posts.forEachIndexed { index, it ->
                    item (
                    ) {
                        if (index != 0) {
                            Divider()
                        }
                        Text(modifier = Modifier.size(90.dp), text = "${index}, ${it}")
                    }
                }
                stickyHeader { Text(text = "Comments") }
                comments.forEachIndexed { index, it ->
                    item (
                    ) {
                        if (index != 0) {
                            Divider()
                        }
                        Text(modifier = Modifier.size(90.dp), text = "${index}, ${it}")
                    }
                }
            }
//    }
}