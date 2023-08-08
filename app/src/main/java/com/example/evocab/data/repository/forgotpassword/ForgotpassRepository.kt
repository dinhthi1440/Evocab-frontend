package com.example.evocab.data.repository.forgotpassword

import com.example.evocab.base.DataResult
import com.example.evocab.data.datasource.forgotpassword.IForgotPassDataSource
import com.example.evocab.model.BaseReponseForgotPass
import com.example.evocab.model.UserRequestForgotPass
import com.example.sourcebase.base.BaseReponsitory

class ForgotpassRepository(private val remote: IForgotPassDataSource.Remote): BaseReponsitory(), IForgotpassRepository {
    override suspend fun sendCodeToEmail(email: UserRequestForgotPass): DataResult<BaseReponseForgotPass> {
        return getResult { remote.sendCodeToEmail(email) }
    }
}