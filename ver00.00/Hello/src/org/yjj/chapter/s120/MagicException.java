package org.yjj.chapter.s120;

public class MagicException extends Exception{

	public MagicException() {
		this("�̷� ������ ���� �Ұ�");
	}
	public MagicException(String message, Throwable cause) {
		super(message, cause);
	}
	public MagicException(String message) {
		super(message+"������ ������ ���� �Ұ�");
	}
	public MagicException(Throwable cause) {
		super(cause);
	}
}
