package classproject.dearme.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Response {
	private boolean success;
	private int code;
	private Result result;

	public static Response success() {
		return new Response(true, 0, null);
	}

	public static <T> Response success(T data) {
		return new Response(true, 0, new Success(data));
	}

	public static Response failure(int code, String message) {
		return new Response(false, code, new Failure(message));
	}
}
