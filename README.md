# ZInfoJavaFile
Java File Info (Java文件信息)

## Usage(用法)

Command:

	java ZInfoJavaFile <path> [<path2> <path3> ...]


## 范例数据

范例数据（有剪裁）——

	ZInfoJavaFile
	Command: java ZInfoJavaFile <path> [<path2> <path3> ...]
	
	<doTestFile>
	File(C:\Program Files (x86)):	
		<File>
		canExecute:	true
		canRead:	true
		canWrite:	true
		exists:	true
		getAbsolutePath:	C:\Program Files (x86)
		getCanonicalPath:	C:\Program Files (x86)
		getFreeSpace:	16778444800
		getName:	Program Files (x86)
		getParent:	C:\
		getPath:	C:\Program Files (x86)
		getTotalSpace:	85904789504
		getUsableSpace:	16778444800
		isAbsolute:	true
		isDirectory:	true
		isFile:	false
		isHidden:	false
		lastModified:	1439028870070
		lastModified.toString:	Sat Aug 08 18:14:30 CST 2015
		lastModified.toLocaleString:	2015-8-8 18:14:30
		length:	28672
		toURI:	file:/C:/Program%20Files%20(x86)/
		toURL:	file:/C:/Program Files (x86)/
		toString:	C:\Program Files (x86)
		listFiles:
		// Count:	 81
		// [0]
			<File>
			canExecute:	true
			canRead:	true
			canWrite:	true
			exists:	true
			getAbsolutePath:	C:\Program Files (x86)\360AP
			getCanonicalPath:	C:\Program Files (x86)\360AP
			getFreeSpace:	16778444800
			getName:	360AP
			getParent:	C:\Program Files (x86)
			getPath:	C:\Program Files (x86)\360AP
			getTotalSpace:	85904789504
			getUsableSpace:	16778444800
			isAbsolute:	true
			isDirectory:	true
			isFile:	false
			isHidden:	false
			lastModified:	1429317507789
			lastModified.toString:	Sat Apr 18 08:38:27 CST 2015
			lastModified.toLocaleString:	2015-4-18 8:38:27
			length:	0
			toURI:	file:/C:/Program%20Files%20(x86)/360AP/
			toURL:	file:/C:/Program Files (x86)/360AP/
			toString:	C:\Program Files (x86)\360AP
	
	...
	
		// [80]
			<File>
			canExecute:	true
			canRead:	true
			canWrite:	true
			exists:	true
			getAbsolutePath:	C:\Program Files (x86)\WizNote
			getCanonicalPath:	C:\Program Files (x86)\WizNote
			getFreeSpace:	16778444800
			getName:	WizNote
			getParent:	C:\Program Files (x86)
			getPath:	C:\Program Files (x86)\WizNote
			getTotalSpace:	85904789504
			getUsableSpace:	16778444800
			isAbsolute:	true
			isDirectory:	true
			isFile:	false
			isHidden:	false
			lastModified:	1428332635721
			lastModified.toString:	Mon Apr 06 23:03:55 CST 2015
			lastModified.toLocaleString:	2015-4-6 23:03:55
			length:	8192
			toURI:	file:/C:/Program%20Files%20(x86)/WizNote/
			toURL:	file:/C:/Program Files (x86)/WizNote/
			toString:	C:\Program Files (x86)\WizNote
	<File>
	File.pathSeparator:	;
	File.pathSeparatorChar:	;
	File.separator:	\
	File.separatorChar:	\
	listRoots():
		// [0]
		<File>
		canExecute:	true
		canRead:	true
		canWrite:	true
		exists:	true
		getAbsolutePath:	C:\
		getCanonicalPath:	C:\
		getFreeSpace:	16778444800
		getName:	
		getParent:	null
		getPath:	C:\
		getTotalSpace:	85904789504
		getUsableSpace:	16778444800
		isAbsolute:	true
		isDirectory:	true
		isFile:	false
		isHidden:	true
		lastModified:	1438971198743
		lastModified.toString:	Sat Aug 08 02:13:18 CST 2015
		lastModified.toLocaleString:	2015-8-8 2:13:18
		length:	16384
		toURI:	file:/C:/
		toURL:	file:/C:/
		toString:	C:\
		// [1]
		<File>
		canExecute:	true
		canRead:	true
		canWrite:	true
		exists:	true
		getAbsolutePath:	D:\
		getCanonicalPath:	D:\
		getFreeSpace:	14693023744
		getName:	
		getParent:	null
		getPath:	D:\
		getTotalSpace:	85899341824
		getUsableSpace:	14693023744
		isAbsolute:	true
		isDirectory:	true
		isFile:	false
		isHidden:	true
		lastModified:	1438999116059
		lastModified.toString:	Sat Aug 08 09:58:36 CST 2015
		lastModified.toLocaleString:	2015-8-8 9:58:36
		length:	8192
		toURI:	file:/D:/
		toURL:	file:/D:/
		toString:	D:\
		// [2]
		<File>
		canExecute:	true
		canRead:	true
		canWrite:	true
		exists:	true
		getAbsolutePath:	E:\
		getCanonicalPath:	E:\
		getFreeSpace:	9183141888
		getName:	
		getParent:	null
		getPath:	E:\
		getTotalSpace:	128849014784
		getUsableSpace:	9183141888
		isAbsolute:	true
		isDirectory:	true
		isFile:	false
		isHidden:	true
		lastModified:	1438999140135
		lastModified.toString:	Sat Aug 08 09:59:00 CST 2015
		lastModified.toLocaleString:	2015-8-8 9:59:00
		length:	16384
		toURI:	file:/E:/
		toURL:	file:/E:/
		toString:	E:\
		// [3]
		<File>
		canExecute:	true
		canRead:	true
		canWrite:	true
		exists:	true
		getAbsolutePath:	F:\
		getCanonicalPath:	F:\
		getFreeSpace:	29566877696
		getName:	
		getParent:	null
		getPath:	F:\
		getTotalSpace:	199450685440
		getUsableSpace:	29566877696
		isAbsolute:	true
		isDirectory:	true
		isFile:	false
		isHidden:	true
		lastModified:	1438971207338
		lastModified.toString:	Sat Aug 08 02:13:27 CST 2015
		lastModified.toLocaleString:	2015-8-8 2:13:27
		length:	4096
		toURI:	file:/F:/
		toURL:	file:/F:/
		toString:	F:\
	<doTestSystem>
	getProperties():
	-- listing properties --
	java.runtime.name=Java(TM) SE Runtime Environment
	sun.boot.library.path=C:\Program Files (x86)\Java\jdk1.8.0_...
	java.vm.version=25.40-b25
	java.vm.vendor=Oracle Corporation
	java.vendor.url=http://java.oracle.com/
	path.separator=;
	java.vm.name=Java HotSpot(TM) Client VM
	file.encoding.pkg=sun.io
	user.script=
	user.country=CN
	sun.java.launcher=SUN_STANDARD
	sun.os.patch.level=Service Pack 1
	java.vm.specification.name=Java Virtual Machine Specification
	java.runtime.version=1.8.0_40-b25
	java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
	java.endorsed.dirs=C:\Program Files (x86)\Java\jdk1.8.0_...
	os.arch=x86

