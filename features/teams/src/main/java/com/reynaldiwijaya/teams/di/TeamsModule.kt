package com.reynaldiwijaya.teams.di

import com.reynaldiwijaya.data.repository.TeamRepository
import com.reynaldiwijaya.data.repository.TeamRepositoryImpl
import com.reynaldiwijaya.teams.domain.TeamUseCase
import com.reynaldiwijaya.teams.ui.TeamViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val teamsModule = module {
    single <TeamRepository> { TeamRepositoryImpl(get()) }
    single { TeamUseCase(get()) }
    viewModel { TeamViewModel(get()) }
}