package architecture.domain.response.base;

import rx.Observable;

/**
 * 创建时间:  2017/06/19 19:16 <br>
 * 作者:  SmartDengg <br>
 * 描述:
 */
public abstract class BaseResponse<T> {

  static final Integer RESULT_OK = 0;

  protected String reason;
  protected Integer error_code;
  protected T data;

  public abstract Observable<T> filterWebServiceErrors();
}