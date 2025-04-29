package com.cloudframe.app.dbissues.file.records;

/**
*  The class Fiz018iReg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class Fiz018iReg extends Fiz018iRegSerialized {
   

								@Getter @Setter private long lngreg018i;
      private List<char[]> fiz018iRegArray1; 

	
	/**
	* Constructor for Fiz018iReg
	**/
    public Fiz018iReg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
