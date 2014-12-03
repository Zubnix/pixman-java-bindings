package org.freedesktop.pixman1;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/include/pixman-1/pixman.h:394</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class pixman_box16 extends Structure {
	public short x1;
	public short y1;
	public short x2;
	public short y2;
	public pixman_box16() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("x1", "y1", "x2", "y2");
	}
	public pixman_box16(short x1, short y1, short x2, short y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public pixman_box16(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends pixman_box16 implements Structure.ByReference {
		
	};
	public static class ByValue extends pixman_box16 implements Structure.ByValue {
		
	};
}
