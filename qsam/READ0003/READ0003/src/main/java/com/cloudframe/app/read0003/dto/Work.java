package com.cloudframe.app.read0003.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] read000401 = new char[8];

						@Getter @Setter private char[] bitmap1644 = new char[16];

						@Getter @Setter private char[] bitmap1240 = new char[16];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRead000401(("READ0004").toCharArray());
								setBitmap1644(getString(new byte[] {(byte)0x80,(byte)0x20,(byte)0x01,(byte)0x20,(byte)0x20,(byte)0x01,(byte)0x20,(byte)0x20,(byte)0x02,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20}).toCharArray());
								setBitmap1240(getString(new byte[] {(byte)0xF0,(byte)0x10,(byte)0x05,(byte)0x42,(byte)0x85,(byte)0x61,(byte)0x80,(byte)0x02,(byte)0x02,(byte)0x20,(byte)0x20,(byte)0x04,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20}).toCharArray());
    }





}
  
