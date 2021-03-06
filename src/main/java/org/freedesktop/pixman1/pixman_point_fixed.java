package org.freedesktop.pixman1;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/include/pixman-1/pixman.h:147</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class pixman_point_fixed extends Structure {
	/** C type : pixman_fixed_t */
	public int x;
	/** C type : pixman_fixed_t */
	public int y;
	public pixman_point_fixed() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("x", "y");
	}
	/**
	 * @param x C type : pixman_fixed_t<br>
	 * @param y C type : pixman_fixed_t
	 */
	public pixman_point_fixed(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public pixman_point_fixed(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends pixman_point_fixed implements Structure.ByReference {
		
	};
	public static class ByValue extends pixman_point_fixed implements Structure.ByValue {
		
	};
}
