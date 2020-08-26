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
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import java.lang.reflect.Type
import javax.lang.model.element.Element
import kotlin.reflect.KClass

@Suppress("FunctionName")
public fun TypeSpecBuilder(poetBuilder: TypeSpec.Builder): TypeSpecBuilder =
    TypeSpecBuilder(poetBuilder, false)

@CodegenDsl
public class TypeSpecBuilder internal constructor(
    public val poetBuilder: TypeSpec.Builder,
    @Suppress("UNUSED_PARAMETER") dummy: Boolean,
) : Taggable.Builder<TypeSpecBuilder>,
    OriginatingElementsHolder.Builder<TypeSpecBuilder> {
    public val annotationSpecs: MutableList<AnnotationSpec> get() = poetBuilder.annotationSpecs
    public val enumConstants: MutableMap<String, TypeSpec> get() = poetBuilder.enumConstants
    public val funSpecs: MutableList<FunSpec> get() = poetBuilder.funSpecs
    public var initializerIndex: Int
        get() = poetBuilder.initializerIndex
        public set(value) {
            poetBuilder.initializerIndex = value
        }
    public val modifiers: MutableSet<KModifier> get() = poetBuilder.modifiers
    override val originatingElements: MutableList<Element> get() = poetBuilder.originatingElements
    public val propertySpecs: MutableList<PropertySpec> get() = poetBuilder.propertySpecs
    public val superclassConstructorParameters: MutableList<CodeBlock> get() = poetBuilder.superclassConstructorParameters
    public val superinterfaces: MutableMap<TypeName, CodeBlock?> get() = poetBuilder.superinterfaces
    public override val tags: MutableMap<KClass<*>, Any> get() = poetBuilder.tags
    public val typeSpecs: MutableList<TypeSpec> get() = poetBuilder.typeSpecs
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

    public fun addEnumConstant(name: String, typeSpec: TypeSpec = anonymousClass()) {
        poetBuilder.addEnumConstant(name = name, typeSpec = typeSpec)
    }

    public fun addFunction(funSpec: FunSpec) {
        poetBuilder.addFunction(funSpec = funSpec)
    }

    public fun addFunctions(funSpecs: Iterable<FunSpec>) {
        poetBuilder.addFunctions(funSpecs = funSpecs)
    }

    public fun addInitializerBlock(block: CodeBlock) {
        poetBuilder.addInitializerBlock(block = block)
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

    public fun addProperties(propertySpecs: Iterable<PropertySpec>) {
        poetBuilder.addProperties(propertySpecs = propertySpecs)
    }

    public fun addProperty(propertySpec: PropertySpec) {
        poetBuilder.addProperty(propertySpec = propertySpec)
    }

    public fun addProperty(
        name: String,
        type: TypeName,
        vararg modifiers: KModifier,
    ) {
        poetBuilder.addProperty(name = name, type = type, modifiers = modifiers)
    }

    public fun addProperty(
        name: String,
        type: TypeName,
        modifiers: Iterable<KModifier>,
    ) {
        poetBuilder.addProperty(name = name, type = type, modifiers = modifiers)
    }

    public fun addProperty(
        name: String,
        type: Type,
        vararg modifiers: KModifier,
    ) {
        poetBuilder.addProperty(name = name, type = type, modifiers = modifiers)
    }

    public fun addProperty(
        name: String,
        type: Type,
        modifiers: Iterable<KModifier>,
    ) {
        poetBuilder.addProperty(name = name, type = type, modifiers = modifiers)
    }

    public fun addProperty(
        name: String,
        type: KClass<*>,
        vararg modifiers: KModifier,
    ) {
        poetBuilder.addProperty(name = name, type = type, modifiers = modifiers)
    }

    public fun addProperty(
        name: String,
        type: KClass<*>,
        modifiers: Iterable<KModifier>,
    ) {
        poetBuilder.addProperty(name = name, type = type, modifiers = modifiers)
    }

    public fun addSuperclassConstructorParameter(codeBlock: CodeBlock) {
        poetBuilder.addSuperclassConstructorParameter(codeBlock = codeBlock)
    }

    public fun addSuperclassConstructorParameter(format: String, vararg args: Any) {
        poetBuilder.addSuperclassConstructorParameter(format = format, args = args)
    }

    public fun addSuperinterface(
        superinterface: TypeName,
        delegate: CodeBlock = emptyCodeBlock,
    ) {
        poetBuilder.addSuperinterface(superinterface = superinterface, delegate = delegate)
    }

    public fun addSuperinterface(superinterface: TypeName, constructorParameter: String) {
        poetBuilder.addSuperinterface(superinterface = superinterface,
            constructorParameter = constructorParameter)
    }

    public fun addSuperinterface(
        superinterface: Type,
        delegate: CodeBlock = emptyCodeBlock,
    ) {
        poetBuilder.addSuperinterface(superinterface = superinterface, delegate = delegate)
    }

    public fun addSuperinterface(
        superinterface: KClass<*>,
        delegate: CodeBlock = emptyCodeBlock,
    ) {
        poetBuilder.addSuperinterface(superinterface = superinterface, delegate = delegate)
    }

    public fun addSuperinterface(superinterface: KClass<*>, constructorParameterName: String) {
        poetBuilder.addSuperinterface(superinterface = superinterface,
            constructorParameterName = constructorParameterName)
    }

    public fun addSuperinterfaces(superinterfaces: Iterable<TypeName>) {
        poetBuilder.addSuperinterfaces(superinterfaces = superinterfaces)
    }

    public fun addType(typeSpec: TypeSpec) {
        poetBuilder.addType(typeSpec = typeSpec)
    }

    public fun addTypeVariable(typeVariable: TypeVariableName) {
        poetBuilder.addTypeVariable(typeVariable = typeVariable)
    }

    public fun addTypeVariables(typeVariables: Iterable<TypeVariableName>) {
        poetBuilder.addTypeVariables(typeVariables = typeVariables)
    }

    public fun addTypes(typeSpecs: Iterable<TypeSpec>) {
        poetBuilder.addTypes(typeSpecs = typeSpecs)
    }

    public fun build(): TypeSpec = poetBuilder.build()
    public fun primaryConstructor(primaryConstructor: FunSpec?) {
        poetBuilder.primaryConstructor(primaryConstructor = primaryConstructor)
    }

    public fun superclass(superclass: TypeName) {
        poetBuilder.superclass(superclass = superclass)
    }

    public fun superclass(superclass: Type) {
        poetBuilder.superclass(superclass = superclass)
    }

    public fun superclass(superclass: KClass<*>) {
        poetBuilder.superclass(superclass = superclass)
    }
}