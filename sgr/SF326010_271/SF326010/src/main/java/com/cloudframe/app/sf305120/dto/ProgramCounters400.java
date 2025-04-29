package com.cloudframe.app.sf305120.dto;

/**
*  The class ProgramCounters400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ProgramCounters400 extends ProgramCounters400Serialized {
   

								@Getter @Setter private short iteration400;

								@Getter @Setter private short sub400;

								@Getter @Setter private short srSub400;

								@Getter @Setter private short sr1Length400;

								@Getter @Setter private short vardataLnth400;

								@Getter @Setter private int isoOffset400;

								@Getter @Setter private int x9aOffset400;

								@Getter @Setter private int eitOffset400;

								@Getter @Setter private int esHdrLen400;

								@Getter @Setter private int siHdrLen400;
	
	/**
	* Constructor for ProgramCounters400
	**/
    public ProgramCounters400() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIteration400((short)0);
								setSub400((short)0);
								setSrSub400((short)0);
								setSr1Length400((short)0);
								setVardataLnth400((short)0);
								setIsoOffset400(0);
								setX9aOffset400(0);
								setEitOffset400(0);
								setEsHdrLen400(0);
								setSiHdrLen400(0);
    }



	/**
	 * 	initializes ProgramCounters400
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIteration400((short)0);
         	setSub400((short)0);
         	setSrSub400((short)0);
         	setSr1Length400((short)0);
         	setVardataLnth400((short)0);
                     setIsoOffset400(0);
                     setX9aOffset400(0);
                     setEitOffset400(0);
                     setEsHdrLen400(0);
                     setSiHdrLen400(0);
   }


}
  
