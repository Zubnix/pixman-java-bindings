package org.freedesktop.pixman1;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * whether 't' is a well defined not obviously empty trapezoid<br>
 * <i>native declaration : /usr/include/pixman-1/pixman.h:1024</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class pixman_span_fix extends Structure {
	/** C type : pixman_fixed_t */
	public int l;
	/** C type : pixman_fixed_t */
	public int r;
	/** C type : pixman_fixed_t */
	public int y;
	public pixman_span_fix() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("l", "r", "y");
	}
	/**
	 * @param l C type : pixman_fixed_t<br>
	 * @param r C type : pixman_fixed_t<br>
	 * @param y C type : pixman_fixed_t
	 */
	public pixman_span_fix(int l, int r, int y) {
		super();
		this.l = l;
		this.r = r;
		this.y = y;
	}
	public pixman_span_fix(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends pixman_span_fix implements Structure.ByReference {
		
	};
	public static class ByValue extends pixman_span_fix implements Structure.ByValue {
		
	};
}
