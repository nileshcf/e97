package com.cloudframe.app.mcvsam2.file.records;

/**
*  The class Sys001IrdExtrFileRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001IrdExtrFileRec extends Sys001IrdExtrFileRecSerialized {
   
				@Getter @Setter private Sys001KeyAll sys001KeyAll = new Sys001KeyAll();

						@Getter @Setter private char[] sys001Ird = Field.fillLowValue(2);
	
	/**
	* Constructor for Sys001IrdExtrFileRec
	**/
    public Sys001IrdExtrFileRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSys001KeyAll().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
