package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgOut260 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class MsgOut260 extends MsgOut260Serialized {
   
			@Getter @Setter private List<SysMsgOutArray260> sysMsgOutArray260 = new ArrayList<>();
    	

								@Getter @Setter private int sysMsgOutMaxCnt260;

								@Getter @Setter private int sysMsgOutCnt260;

						@Getter @Setter private char[] consMsgOut260 = new char[300];
	
	/**
	* Constructor for MsgOut260
	**/
    public MsgOut260() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SYS_MSG_OUT_ARRAY_260_SIZE;arrayIndex++) {
						getSysMsgOutArray260().add(new SysMsgOutArray260(this, beginSysMsgOutArray260 + 
						arrayIndex * SysMsgOutArray260.getSysMsgOutArray260FieldLength()));
				}
	   	/*  end of offset */
								setSysMsgOutMaxCnt260(20);
								setSysMsgOutCnt260(0);
								setConsMsgOut260(pad(300," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
