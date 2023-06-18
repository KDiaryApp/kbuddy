package com.kdiaryapp.kbuddy

import android.widget.Toast
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.indendshape.Height
import com.exyte.animatednavbar.animation.indendshape.IndentAnimation
import com.exyte.animatednavbar.items.dropletbutton.DropletButton

import androidx.compose.ui.res.vectorResource

/*
    TODO
        - This should be responsible for a separate screen loading users posts.
        It can be the main screen i.e., right after logging, or navigated to via the bottom navigation bar.
        The posts are surely gonna be via a time-consuming mockup code, to replicate real-life sencario, or even directly loading data from disk should also do the job for replicating Network IO.
 */

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Posts(
    contentPadding: PaddingValues
) {
    // This lazy vertical grid should be the place holder for the posts that are to be loaded.
    var posts: List<String> = listOf(
        "Post#1",
        "Post#2",
        "Post#3",
        "Post#4",
        "Post#5",
        "Post#5",
        "Post#6",
        "Post#7",
        "Post#8",
        "Post#9",
        "Post#10"
    )
    LazyColumn(
        contentPadding = contentPadding,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .wrapContentSize(align = Alignment.Center)
//                columns = GridCells.Fixed(2),
//                content =
    ) {
        posts.forEachIndexed { index, it ->
            item(
            ) {
                Card (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                        .height(height = 150.dp)
                        .clickable {
                            /*
                                - TODO
                                - Make the card highlighted, then by clicking on the edit button, i should be able to open it up and edit it.
                             */
                        }
                ){
                    Text(
                        text = "${index}, ${it}",
                        modifier = Modifier
                            .size(90.dp)
                    )
                }
            }
        }
    }
}

/*
    - Trying to implement a animated bottom navigation bar
 */
@Composable
fun bottomAnimationNavigation() {
    var selectedIndex by remember { mutableStateOf(0) }
    AnimatedNavigationBar(
        indentAnimation = Height(tween(300)),
        selectedIndex = selectedIndex,
        barColor = Color.Gray,
        modifier = Modifier,
        content = {
            DropletButton(
                isSelected = true,
                dropletColor = Color.Black,
                onClick = { /*TODO*/ },
                icon = androidx.core.R.drawable.ic_call_answer,
//                icon = Icons.Outlined.Add,
//                icon = loadVec(),
//                icon = Icon(imageVector = Icons.Outlined.Create, contentDescription = null),
//                Icons.Outlined.AccountBox.
                modifier = Modifier
                    .height(20.dp)
            )
            DropletButton(
                isSelected = false,
                dropletColor = Color.Black,
                onClick = { /*TODO*/ },
                icon = androidx.core.R.drawable.ic_call_answer_video,
                modifier = Modifier
                    .height(20.dp)
            )
            DropletButton(
                isSelected = false,
                dropletColor = Color.Black,
                onClick = { /*TODO*/ },
                icon = androidx.core.R.drawable.ic_call_decline,
                modifier = Modifier
                    .height(20.dp)
            )
            DropletButton(
                isSelected = false,
                dropletColor = Color.Black,
                onClick = { /*TODO*/ },
                icon = androidx.core.R.drawable.ic_call_decline,
                modifier = Modifier
                    .height(20.dp)
            )
        },
    )
//    {
//        DropletButton(
//            isSelected = true,
//            onClick = { /*TODO*/ },
//            icon = R.drawable.ic_launcher_foreground,
//            modifier = Modifier
//                .height(20.dp)
////            Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
//        )
//    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun wholePreview() {
//    val scaffoldState = rememberSc(rememberDrawerState(initialValue = DrawerValue.Open))
    Scaffold(
//        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Simple Scaffold Screen")
                },
                navigationIcon = {
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                }
            )
        },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
//                    Toast.makeText( j, "Hello", Toast.LENGTH_SHORT).show()
                }
            ) {
                Icon(imageVector = Icons.Default.Create, contentDescription = null)
            }
        },
        content = {
            Posts(contentPadding = it)
        },
        bottomBar = {
            BottomNavigationBar(
                items = listOf(
                    BottomNavItem(
                        name = "Home",
                        route = "HomeRoute",
                        icon = Icons.Default.Home
                    ),
                    BottomNavItem(
                        name = "Update",
                        route = "UpdateRoute",
                        icon = Icons.Default.Notifications,
                        badgeCount = 24
                    ),
                    BottomNavItem(
                        name = "Menu",
                        route = "MenuRoute",
                        icon = Icons.Filled.Menu,
                    )
                )
            )
//            bottomAnimationNavigation()
        },
//        snackbarHost = {},
//        drawerContent = {}
    )
}

data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgeCount: Int = 0
)
@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>
) {
    BottomAppBar(
//        floatingActionButton = {
//            FloatingActionButton(onClick = { /*TODO*/ }) {
//
//            }
//        }
    ) {
        Row (
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
        ) {
            items.forEach{element ->
                IconButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = element.icon,
                        contentDescription = null
                    )
                }
            }
        }
    }
}

