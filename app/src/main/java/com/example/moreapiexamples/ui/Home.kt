package com.example.moreapiexamples.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.moreapiexamples.HomeViewModel

@Composable
fun Home(){
    val homeViewModel = viewModel(modelClass = HomeViewModel::class.java)
    val list by homeViewModel.state.collectAsState()

    LazyColumn(content = {
        items(list){
            Card(
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.padding(16.dp)
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Text(text = it.name)
                    Text(text = it.species)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    })
}