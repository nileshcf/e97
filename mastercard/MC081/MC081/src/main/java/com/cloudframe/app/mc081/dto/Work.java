package com.cloudframe.app.mc081.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] fbBigRec = Field.fillLowValue(134);

								@Getter @Setter private short vbsRecordLen;
      private List<char[]> vbsRecordArray1; 


						@Getter @Setter private char[] fbFileStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
