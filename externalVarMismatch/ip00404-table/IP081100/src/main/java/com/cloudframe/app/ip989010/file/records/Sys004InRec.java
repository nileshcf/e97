package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys004InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys004InRec extends Sys004InRecSerialized {
   

						@Getter @Setter private char[] sys004MtiFc = Field.fillLowValue(7);

						@Getter @Setter private char[] sys004TagKey = Field.fillLowValue(13);
				@Getter @Setter private Sys004TagData sys004TagData = new Sys004TagData();
	
	/**
	* Constructor for Sys004InRec
	**/
    public Sys004InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSys004TagData().setParent(this,getStartOffset() + 20);
	   	/*  end of offset */
    }





}
  
