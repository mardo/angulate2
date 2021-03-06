//     Project: angulate2 (https://github.com/jokade/angulate2)
// Description:

// Copyright (c) 2016 Johannes.Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included LICENSE file)
package angulate2.http

import angulate2.http.Http.RequestOptionsArgs
import rxjs.Observable

import scala.scalajs.js
import scala.scalajs.js.JSON
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("@angular/http","Http")
class Http extends js.Object {
  def get(url: String, options: js.UndefOr[RequestOptionsArgs] = js.undefined): Observable[Response] = js.native
  def post(url: String, body: js.Any, options: js.UndefOr[RequestOptionsArgs] = js.undefined): Observable[Response] = js.native
  def put(url: String, body: js.Any, options: js.UndefOr[RequestOptionsArgs] = js.undefined): Observable[Response] = js.native
  def delete(url: String, options: js.UndefOr[RequestOptionsArgs] = js.undefined): Observable[Response] = js.native
}

object Http {
  type RequestOptionsArgs = js.Dynamic

  implicit final class RichHttp(val http: Http) extends AnyVal {
    @inline
    def putJson(url: String, data: js.Any, options: js.UndefOr[RequestOptionsArgs] = js.undefined): Observable[Response] =
      http.put(url,JSON.stringify(data),options)

    @inline
    def postJson(url: String, data: js.Any, options: js.UndefOr[RequestOptionsArgs] = js.undefined): Observable[Response] =
      http.post(url,JSON.stringify(data),options)
  }
}
