import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Calendar;


/**
 * Java文件信息.
 * 
 * @author zyl910
 *
 */
public class ZInfoJavaFile {
	//private static Logger logger = LogManager.getLogger(TestProbe.class);
	
	/** 路径集.
	 */
	public String[] paths;
	
	/** 取得缩进字符串.
	 * 
	 * @param indent	缩进.
	 * @return	返回缩进字符串.
	 */
	private static String getIndentString(int indent) {
		String rt = "";
		if (indent<0) indent=0;
		for(int i=0; i<indent; ++i) {
			rt += '\t';
		}
		return rt;
	}
	
	/** 输出日志
	 * 
	 * @param str	文本.
	 */
	private void LogOut(String str) {
		//logger.info(str);
		System.out.println(str);
	}
	
	/** 打印文件信息.
	 * 
	 * @param indent	缩进.
	 * @param obj	文件对象.
	 */
	private void printFile(int indent, File obj) {
		//int indentnext = indent+1;
		String indentstr = getIndentString(indent);
		LogOut(indentstr + "<File>");
		LogOut(indentstr + String.format("canExecute:\t%b", obj.canExecute()));
		LogOut(indentstr + String.format("canRead:\t%b", obj.canRead()));
		LogOut(indentstr + String.format("canWrite:\t%b", obj.canWrite()));
		LogOut(indentstr + String.format("exists:\t%b", obj.exists()));
		LogOut(indentstr + String.format("getAbsolutePath:\t%s", obj.getAbsolutePath()));
		try {
			LogOut(indentstr + String.format("getCanonicalPath:\t%s", obj.getCanonicalPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		LogOut(indentstr + String.format("getFreeSpace:\t%d", obj.getFreeSpace()));
		LogOut(indentstr + String.format("getName:\t%s", obj.getName()));
		LogOut(indentstr + String.format("getParent:\t%s", obj.getParent()));
		LogOut(indentstr + String.format("getPath:\t%s", obj.getPath()));
		LogOut(indentstr + String.format("getTotalSpace:\t%d", obj.getTotalSpace()));
		LogOut(indentstr + String.format("getUsableSpace:\t%d", obj.getUsableSpace()));
		LogOut(indentstr + String.format("isAbsolute:\t%b", obj.isAbsolute()));
		LogOut(indentstr + String.format("isDirectory:\t%b", obj.isDirectory()));
		LogOut(indentstr + String.format("isFile:\t%b", obj.isFile()));
		LogOut(indentstr + String.format("isHidden:\t%b", obj.isHidden()));
		LogOut(indentstr + String.format("lastModified:\t%d", obj.lastModified()));
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(obj.lastModified());
		LogOut(indentstr + String.format("lastModified.toString:\t%s", cal.getTime().toString()));
		LogOut(indentstr + String.format("lastModified.toLocaleString:\t%s", cal.getTime().toLocaleString()));
		//Date dt = new Date();
		//LogOut(indentstr + String.format("lastModified.toString:\t%s", dt.toString()));
		//LogOut(indentstr + String.format("lastModified.toLocaleString:\t%s", dt.toLocaleString()));
		LogOut(indentstr + String.format("length:\t%d", obj.length()));
		LogOut(indentstr + String.format("toURI:\t%s", obj.toURI()));
		try {
			LogOut(indentstr + String.format("toURL:\t%s", obj.toURL()));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		LogOut(indentstr + String.format("toString:\t%s", obj.toString()));
	}
	
	
	/**
	 * 执行测试系统 .
	 */
	public void doTestSystem(int indent) {
		//int indentnext = indent+1;
		String indentstr = getIndentString(indent);
		LogOut(indentstr + "<doTestSystem>");
		// getProperties.
		LogOut(indentstr + "getProperties():");
		System.getProperties().list(System.out);
	}
	
	/**
	 * 执行测试文件.
	 */
	public void doTestFile(int indent) {
		int indentnext = indent+1;
		String indentstr = getIndentString(indent);
		int i;
		LogOut(indentstr + "<doTestFile>");
		// paths.
		String[] paths = this.paths;
		if (null==paths || paths.length<=0) paths=new String[]{"."};
		for(String s:paths) {
			LogOut(indentstr + String.format("File(%s):\t", s) );
			File f = new File(s);
			printFile(indentnext, f);
			// listFiles.
			LogOut(indentstr + "\tlistFiles:");
			File[] lst = f.listFiles();
			if (null==lst) lst=new File[0];
			LogOut(indentstr + String.format("\t// Count:\t %d", lst.length));
			for(i=0; i<lst.length; ++i) {
				LogOut(indentstr + String.format("\t// [%d]", i));
				File obj = lst[i];
				printFile(indentnext+1, obj);
			}
		}
		// fields.
		LogOut(indentstr + "<File>");
		LogOut(indentstr + String.format("File.pathSeparator:\t%s", File.pathSeparator));
		LogOut(indentstr + String.format("File.pathSeparatorChar:\t%c", File.pathSeparatorChar));
		LogOut(indentstr + String.format("File.separator:\t%s", File.separator));
		LogOut(indentstr + String.format("File.separatorChar:\t%c", File.separatorChar));
		// listRoots.
		LogOut(indentstr + "listRoots():");
		File[] lst = File.listRoots();
		for(i=0; i<lst.length; ++i) {
			LogOut(indentstr + String.format("\t// [%d]", i));
			File obj = lst[i];
			printFile(indentnext, obj);
		}
//		// list.
//		LogOut(indentstr + "listFiles(\".\"):");
//		lst = new File(".").listFiles();
//		for(i=0; i<lst.length; ++i) {
//			LogOut(indentstr + String.format("\t// [%d]", i));
//			File obj = lst[i];
//			printFile(indentnext, obj);
//		}
	}
	
	
	/**
	 * 执行测试.
	 */
	public void doTest() {
		int indentnext = 0; 
		LogOut("ZInfoJavaFile");
		LogOut("Command: java ZInfoJavaFile <path> [<path2> <path3> ...]");
		LogOut("");
		doTestFile(indentnext);
		doTestSystem(indentnext);
	}
	
	/** 构造 ZInfoJavaFile.
	 * 
	 */
	public ZInfoJavaFile() {
		//
	}
	
	/** 构造 ZInfoJavaFile, 带 paths 参数.
	 * 
	 * @param paths
	 */
	public ZInfoJavaFile(String[] paths) {
		this();
		this.paths = paths;
	}

	public static void main(String[] args) {
		new ZInfoJavaFile(args).doTest();
	}

}
