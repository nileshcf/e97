package com.cloudframe.app.sf311010.dto;

/**
*  The class MciabendParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MciabendParms extends MciabendParmsSerialized {
   

						@Getter @Setter private char[] mciabendModule = new char[8];

						@Getter @Setter private char[] mcabendModule = new char[8];
				@Getter @Setter private MciabendParm1 mciabendParm1 = new MciabendParm1();
	
	/**
	* Constructor for MciabendParms
	**/
    public MciabendParms() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMciabendParm1().setParent(this,getStartOffset() + 16);
	   	/*  end of offset */
								setMciabendModule(("MCIABEND").toCharArray());
								setMcabendModule(("MCABEND ").toCharArray());
    }





}
  
