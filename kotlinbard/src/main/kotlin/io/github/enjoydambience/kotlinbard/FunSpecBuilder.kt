/*
 * Copyright (c) 2020 Benjamin Ye
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.enjoydambience.kotlinbard

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.ParameterSpec
import java.lang.reflect.Type
import javax.lang.model.element.Element
import javax.lang.model.element.ExecutableElement
import javax.lang.model.element.Modifier
import kotlin.reflect.KClass

@Suppress("FunctionName")
public fun FunSpecBuilder(poetBuilder: FunSpec.Builder): FunSpecBuilder =
    FunSpecBuilder(poetBuilder, false)

@CodegenDsl
public class FunSpecBuilder internal constructor(
    public val poetBuilder: FunSpec.Builder,
    @Suppress("UNUSED_PARAMETER") dummy: Boolean,
) : Taggable.Builder<FunSpecBuilder>,
    OriginatingElementsHolder.Builder<FunSpecBuilder> {
    public val annotations: MutableList<AnnotationSpec> get() = poetBuilder.annotations
    public val modifiers: MutableList<KModifier> get() = poetBuilder.modifiers
    override val originatingElements: MutableList<Element> get() = poetBuilder.originatingElements
    public val parameters: MutableList<ParameterSpec> get() = poetBuilder.parameters
    public override val tags: MutableMap<KClass<*>, Any> get() = poetBuilder.tags
    public val typeVariables: MutableList<TypeVariableName> get() = poetBuilder.typeVariables
    public fun addAnnotation(annotationSpec: AnnotationSpec) {
        poetBuilder.addAnnotation(annotationSpec = annotationSpec)
    }

    public fun addAnnotation(annotation: ClassName) {
        poetBuilder.addAnnotation(annotation = annotation)
    }

    public fun addAnnotation(annotation: Class<*>) {
        poetBuilder.addAnnotation(annotation = annotation)
    }

    public fun addAnnotation(annotation: KClass<*>) {
        poetBuilder.addAnnotation(annotation = annotation)
    }

    public fun addAnnotations(annotationSpecs: Iterable<AnnotationSpec>) {
        poetBuilder.addAnnotations(annotationSpecs = annotationSpecs)
    }

    public fun addCode(codeBlock: CodeBlock) {
        poetBuilder.addCode(codeBlock = codeBlock)
    }

    public fun addCode(format: String, vararg args: Any?) {
        poetBuilder.addCode(format = format, args = args)
    }

    public fun addComment(format: String, vararg args: Any) {
        poetBuilder.addComment(format = format, args = args)
    }

    public fun addKdoc(block: CodeBlock) {
        poetBuilder.addKdoc(block = block)
    }

    public fun addKdoc(format: String, vararg args: Any) {
        poetBuilder.addKdoc(format = format, args = args)
    }

    public fun addModifiers(vararg modifiers: KModifier) {
        poetBuilder.addModifiers(modifiers = modifiers)
    }

    public fun addModifiers(modifiers: Iterable<KModifier>) {
        poetBuilder.addModifiers(modifiers = modifiers)
    }

    public fun addNamedCode(format: String, args: Map<String, *>) {
        poetBuilder.addNamedCode(format = format, args = args)
    }

    public fun addParameter(parameterSpec: ParameterSpec) {
        poetBuilder.addParameter(parameterSpec = parameterSpec)
    }

    public fun addParameter(
        name: String,
        type: TypeName,
        vararg modifiers: KModifier,
    ) {
        poetBuilder.addParameter(name = name, type = type, modifiers = modifiers)
    }

    public fun addParameter(
        name: String,
        type: TypeName,
        modifiers: Iterable<KModifier>,
    ) {
        poetBuilder.addParameter(name = name, type = type, modifiers = modifiers)
    }

    public fun addParameter(
        name: String,
        type: Type,
        vararg modifiers: KModifier,
    ) {
        poetBuilder.addParameter(name = name, type = type, modifiers = modifiers)
    }

    public fun addParameter(
        name: String,
        type: Type,
        modifiers: Iterable<KModifier>,
    ) {
        poetBuilder.addParameter(name = name, type = type, modifiers = modifiers)
    }

    public fun addParameter(
        name: String,
        type: KClass<*>,
        vararg modifiers: KModifier,
    ) {
        poetBuilder.addParameter(name = name, type = type, modifiers = modifiers)
    }

    public fun addParameter(
        name: String,
        type: KClass<*>,
        modifiers: Iterable<KModifier>,
    ) {
        poetBuilder.addParameter(name = name, type = type, modifiers = modifiers)
    }

    public fun addParameters(parameterSpecs: Iterable<ParameterSpec>) {
        poetBuilder.addParameters(parameterSpecs = parameterSpecs)
    }

    public fun addStatement(format: String, vararg args: Any) {
        poetBuilder.addStatement(format = format, args = args)
    }

    public fun addTypeVariable(typeVariable: TypeVariableName) {
        poetBuilder.addTypeVariable(typeVariable = typeVariable)
    }

    public fun addTypeVariables(typeVariables: Iterable<TypeVariableName>) {
        poetBuilder.addTypeVariables(typeVariables = typeVariables)
    }

    public fun beginControlFlow(controlFlow: String, vararg args: Any) {
        poetBuilder.beginControlFlow(controlFlow = controlFlow, args = args)
    }

    public fun build(): FunSpec = poetBuilder.build()
    public fun callSuperConstructor(vararg args: CodeBlock) {
        poetBuilder.callSuperConstructor(args = args)
    }

    public fun callSuperConstructor(vararg args: String) {
        poetBuilder.callSuperConstructor(args = args)
    }

    public fun callSuperConstructor(args: Iterable<CodeBlock>) {
        poetBuilder.callSuperConstructor(args = args)
    }

    public fun callSuperConstructor(args: List<CodeBlock>) {
        poetBuilder.callSuperConstructor(args = args)
    }

    public fun callThisConstructor(vararg args: CodeBlock) {
        poetBuilder.callThisConstructor(args = args)
    }

    public fun callThisConstructor(vararg args: String) {
        poetBuilder.callThisConstructor(args = args)
    }

    public fun callThisConstructor(args: Iterable<CodeBlock>) {
        poetBuilder.callThisConstructor(args = args)
    }

    public fun callThisConstructor(args: List<CodeBlock>) {
        poetBuilder.callThisConstructor(args = args)
    }

    public fun clearBody() {
        poetBuilder.clearBody()
    }

    public fun endControlFlow() {
        poetBuilder.endControlFlow()
    }

    public fun jvmModifiers(modifiers: Iterable<Modifier>): Unit =
        poetBuilder.jvmModifiers(modifiers = modifiers)

    public fun nextControlFlow(controlFlow: String, vararg args: Any) {
        poetBuilder.nextControlFlow(controlFlow = controlFlow, args = args)
    }

    public fun receiver(receiverType: TypeName, kdoc: CodeBlock = emptyCodeBlock) {
        poetBuilder.receiver(receiverType = receiverType, kdoc = kdoc)
    }

    public fun receiver(receiverType: Type, kdoc: CodeBlock = emptyCodeBlock) {
        poetBuilder.receiver(receiverType = receiverType, kdoc = kdoc)
    }

    public fun receiver(
        receiverType: Type,
        kdoc: String,
        vararg args: Any,
    ) {
        poetBuilder.receiver(receiverType = receiverType, kdoc = kdoc, args = args)
    }

    public fun receiver(
        receiverType: KClass<*>,
        kdoc: CodeBlock = emptyCodeBlock,
    ) {
        poetBuilder.receiver(receiverType = receiverType, kdoc = kdoc)
    }

    public fun receiver(
        receiverType: KClass<*>,
        kdoc: String,
        vararg args: Any,
    ) {
        poetBuilder.receiver(receiverType = receiverType, kdoc = kdoc, args = args)
    }

    public fun returns(returnType: TypeName, kdoc: CodeBlock = emptyCodeBlock) {
        poetBuilder.returns(returnType = returnType, kdoc = kdoc)
    }

    public fun returns(returnType: Type, kdoc: CodeBlock = emptyCodeBlock) {
        poetBuilder.returns(returnType = returnType, kdoc = kdoc)
    }

    public fun returns(
        returnType: Type,
        kdoc: String,
        vararg args: Any,
    ) {
        poetBuilder.returns(returnType = returnType, kdoc = kdoc, args = args)
    }

    public fun returns(returnType: KClass<*>, kdoc: CodeBlock = emptyCodeBlock) {
        poetBuilder.returns(returnType = returnType, kdoc = kdoc)
    }

    public fun returns(
        returnType: KClass<*>,
        kdoc: String,
        vararg args: Any,
    ) {
        poetBuilder.returns(returnType = returnType, kdoc = kdoc, args = args)
    }
}
