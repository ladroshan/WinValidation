package com.winfooz.validation.annotations

import androidx.annotation.IdRes
import androidx.annotation.StringRes
import com.winfooz.annotations.Adapter
import com.winfooz.annotations.AutoValidateWith
import com.winfooz.annotations.ErrorHandling
import com.winfooz.annotations.Rule
import com.winfooz.validation.adapters.EditTextAdapter
import com.winfooz.validation.adapters.autovalidate.EditTextAutoValidate
import com.winfooz.validation.errorhandlingadapters.EditTextErrorHandling
import com.winfooz.validation.rules.NotBlankValidationRule

/**
 * Project: WinValidation
 * Created: Aug 10, 2019
 *
 * @author Mohamed Hamdan
 */
@Adapter(EditTextAdapter::class)
@AutoValidateWith(EditTextAutoValidate::class)
@Rule(NotBlankValidationRule::class)
@ErrorHandling(EditTextErrorHandling::class)
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class NotBlank(@IdRes val value: Int, @StringRes val messageResId: Int)
