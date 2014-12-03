package org.freedesktop.pixman1;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/include/pixman-1/pixman.h:167</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class pixman_transform extends Structure {
	/** C type : pixman_fixed_t[3][3] */
	public int[] matrix = new int[((3) * (3))];
	public pixman_transform() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("matrix");
	}
	/** @param matrix C type : pixman_fixed_t[3][3] */
	public pixman_transform(int matrix[]) {
		super();
		if ((matrix.length != this.matrix.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.matrix = matrix;
	}
	public pixman_transform(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends pixman_transform implements Structure.ByReference {
		
	};
	public static class ByValue extends pixman_transform implements Structure.ByValue {
		
	};
}
