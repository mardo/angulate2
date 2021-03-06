//     Project: angulate2 (https://github.com/jokade/angulate2)
// Description: Object to allow simple import of the most commonly used annotations and operations

// Copyright (c) 2016 Johannes.Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included LICENSE file)
package angulate2

import scala.annotation.{StaticAnnotation, compileTimeOnly}
import scala.language.experimental.macros
import scala.scalajs.js

/**
 * Import this object to get the most commonly used angulate2 annotations and operators.
 *
 * @example ```import angulate2.std._```
 */
object std extends OpsTrait {

  // duplicate definition of core.Component since `type = core.Component` won't compile
  // NOTE: keep in sync with core.Component()!!
  @compileTimeOnly("enable macro paradise to expand macro annotations")
  class Component(selector: String = null,
                inputs: js.Array[String] = null,
                outputs: js.Array[String] = null,
                host: js.Any = null,
                exportAs: String = null,
                moduleId: js.Any = null,
                providers: js.Array[js.Any] = null,
                viewProviders: js.Array[js.Any] = null,
                changeDetection: js.Any = null,
                queries: js.Any = null,
                templateUrl: String = null,
                template: String = null,
                styles: js.Array[String] = null,
                styleUrls: js.Array[String] = null,
                animations: js.Array[js.Any] = null,
                encapsulation: js.Any = null,
                interpolation: js.Any = null,
                entryComponents: js.Array[js.Any] = null) extends StaticAnnotation {
    def macroTransform(annottees: Any*): Any = macro core.Component.Macro.impl
  }

  // duplicate definition of core.Injectable since `type = core.Injectable` won't compile
  // NOTE: keep in sync with core.Injectable()!!
  @compileTimeOnly("enable macro paradise to expand macro annotations")
  class Injectable extends StaticAnnotation {
    def macroTransform(annottees: Any*): Any = macro core.Injectable.Macro.impl
  }

  // duplicate definition of core.NgModule since `type = core.NgModule` won't compile
  // NOTE: keep in sync with core.NgModule()!!
  @compileTimeOnly("enable macro paradise to expand macro annotations")
  class NgModule(providers: js.Array[js.Any] = null,
                 declarations: js.Array[js.Any] = null,
                 imports: js.Array[js.Any] = null,
                 exports: js.Array[js.Any] = null,
                 entryComponents: js.Array[js.Any] = null,
                 bootstrap: js.Array[js.Any] = null,
                 schemas: js.Array[js.Any] = null,
                 id: String = null) extends StaticAnnotation {
    def macroTransform(annottees: Any*): Any = macro core.NgModule.Macro.impl
  }

  // duplicate definition of core.Directive since `type = core.Directive` won't compile
  // NOTE: keep in sync with core.Directive()!!
  @compileTimeOnly("enable macro paradise to expand macro annotations")
  class Directive(selector: String = null,
                  inputs: js.Array[String] = null,
                  outputs: js.Array[String] = null,
                  host: js.Dictionary[String] = null,
                  template: String = null,
                  providers: js.Array[js.Any] = null,
                  exportAs: String = null,
                  queries: js.Any = null) extends StaticAnnotation {
    def macroTransform(annottees: Any*): Any = macro core.Directive.Macro.impl
  }

  type Input = core.Input
  type OnInit = core.OnInit
  type OnDestroy = core.OnDestroy


  // duplicate definition of ext.Data since `type = ext.Data` won't compile
  // NOTE: keep in sync with ext.Data()!!
  @compileTimeOnly("enable macro paradise to expand macro annotations")
  class Data extends StaticAnnotation {
    def macroTransform(annottees: Any*): Any = macro ext.Data.Macro.impl
  }
}

