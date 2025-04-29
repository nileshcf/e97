package com.cloudframe.app.dbissues.file.records;

/**
*  The class Fiz018oReg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class Fiz018oReg extends Fiz018oRegSerialized {
   

								@Getter @Setter private long lngreg018o;
      private List<char[]> fiz018oRegArray1; 

	
	/**
	* Constructor for Fiz018oReg
	**/
    public Fiz018oReg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
