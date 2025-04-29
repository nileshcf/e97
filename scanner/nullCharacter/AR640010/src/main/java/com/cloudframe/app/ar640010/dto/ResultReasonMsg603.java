package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultReasonMsg603 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ResultReasonMsg603 extends ResultReasonMsg603Serialized {
   

							@Getter @Setter private char[] resultReasonMsg603ConditionGroup1 = new char[9];
						

						@Getter @Setter private char[] resultReason603 = new char[29];
				@Getter @Setter private ResultReason603Redefined01 resultReason603Redefined01 = new ResultReason603Redefined01();
				@Getter @Setter private ResultReason603Redefined resultReason603Redefined = new ResultReason603Redefined();
	
	/**
	* Constructor for ResultReasonMsg603
	**/
    public ResultReasonMsg603() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getResultReason603Redefined01().setParent(this,getStartOffset() + 9);
					getResultReason603Redefined().setParent(this,getStartOffset() + 9);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 0
             ,9
             );
								setResultReason603(fillSpace(29));
    }





}
  
