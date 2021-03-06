//     Project: angulate2
//      Module: @angular/core/di/provider.ts (v2.2.1)
// Description: Façade traits for Angular2 providers

// Copyright (c) 2016 Johannes.Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included LICENSE file)
package angulate2.core

import scala.scalajs.js

@js.native
sealed trait Provider extends js.Object

@js.native
trait TypeProvider extends Provider

@js.native
trait ValueProvider extends Provider {
  def provide: js.Any = js.native
  def useValue: js.Any = js.native
  def multi: js.UndefOr[Boolean] = js.native
}

@js.native
trait ClassProvider extends Provider {
  def provide: js.Any = js.native
  def useClass: js.Any = js.native
  def multi: js.UndefOr[Boolean] = js.native
}

@js.native
trait ExistingProvider extends Provider {
  def provide: js.Any = js.native
  def useExisting: js.Any = js.native
  def multi: js.UndefOr[Boolean] = js.native
}

@js.native
trait FactoryProvider extends Provider {
  def provide: js.Any = js.native
  def useFactory: js.Function = js.native
  def deps: js.UndefOr[js.Array[js.Any]] = js.native
  def multi: js.UndefOr[Boolean] = js.native
}
