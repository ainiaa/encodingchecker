package allen.model;

import java.io.File;

import allen.main.Config;

/**
 * �û����ݡ�
 * */
public class UserData implements StateListener {

	public static UserData userData = new UserData();

	private UserData() {
		init();
		StateMachine.register(this);
	}

	/** about user input. */
	private File file;

	private byte[] fileContent;

	/** encoding which user select. */
	private String encoding;

	private void init() {
		file = null;
		fileContent = null;
		encoding = Config.Default_Encoding;
	}

	@Override
	public void update(Action action) {
		switch (action) {
		case InitProgram:
			init();
			break;
		default:
			break;
		}
	}

	/**
	 * �Ƿ��пɹ������ļ���
	 * */
	public boolean hasFile() {
		return file != null;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

}
