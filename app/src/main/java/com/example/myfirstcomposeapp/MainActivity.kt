package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstcomposeapp.components.MYDropDownItem
import com.example.myfirstcomposeapp.components.MyAdvanceList
import com.example.myfirstcomposeapp.components.MyBasicList
import com.example.myfirstcomposeapp.components.MyCheckBox
import com.example.myfirstcomposeapp.components.MyDropDownMenu
import com.example.myfirstcomposeapp.components.MyExposedDropDownMenu
import com.example.myfirstcomposeapp.components.MyGridList
import com.example.myfirstcomposeapp.components.MyIcon
import com.example.myfirstcomposeapp.components.MyNavigationBar
import com.example.myfirstcomposeapp.components.MyNetworkImage
import com.example.myfirstcomposeapp.components.MySwitch
import com.example.myfirstcomposeapp.components.MyTexts
import com.example.myfirstcomposeapp.components.MyTopAppBar
import com.example.myfirstcomposeapp.components.ParentCheckBoxes
import com.example.myfirstcomposeapp.components.ScrollList
import com.example.myfirstcomposeapp.components.layout.MyColumn
import com.example.myfirstcomposeapp.components.layout.MyComplexLayout
import com.example.myfirstcomposeapp.components.layout.MyRow
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { MyTopAppBar() },
                    bottomBar= { MyNavigationBar() }
                    ) { innerPadding ->
                    Box(
                        modifier = Modifier.fillMaxSize().padding(innerPadding).background(Color.Cyan),
                        contentAlignment = Alignment.Center
                    ){
                        //Text(text = "Esta es mi screen")
                        MyGridList()
                    }
                }
            }
        }
    }
}