package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MciseqioArea extends MciseqioAreaSerialized {
   

						@Getter @Setter private char[] mciseqioModule = new char[8];

						@Getter @Setter private char[] mcseqioModule = new char[8];

				@Getter @Setter private MciseqioParms mciseqioParms = new MciseqioParms();
				@Getter @Setter private MciseqioCodes mciseqioCodes = new MciseqioCodes();

								@Getter @Setter private short mciseqioReturnCode;

	
	/**
	* Constructor for MciseqioArea
	**/
    public MciseqioArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMciseqioParms().setParent(this,getStartOffset() + 41);
					getMciseqioCodes().setParent(this,getStartOffset() + 125);
	   	/*  end of offset */
								setMciseqioModule(("MCISEQIO").toCharArray());
								setMcseqioModule(("MCSEQIO ").toCharArray());
       replaceValue( // serialize and save the value
             ("* MCSEQIO-PARMS BEGINS * ").toCharArray()
             , getStartOffset() + 16
             ,25
             );
       replaceValue( // serialize and save the value
             ("0000  MCISEQIO-PARMS   ENDS  0000").toCharArray()
             , getStartOffset() + 165
             ,33
             );
    }





}
  
