package org.freedesktop.pixman1;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/include/pixman-1/pixman.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class pixman_glyph_t extends Structure {
	public int x;
	public int y;
	/** C type : const void* */
	public Pointer glyph;
	public pixman_glyph_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("x", "y", "glyph");
	}
	/** @param glyph C type : const void* */
	public pixman_glyph_t(int x, int y, Pointer glyph) {
		super();
		this.x = x;
		this.y = y;
		this.glyph = glyph;
	}
	public pixman_glyph_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends pixman_glyph_t implements Structure.ByReference {
		
	};
	public static class ByValue extends pixman_glyph_t implements Structure.ByValue {
		
	};
}
