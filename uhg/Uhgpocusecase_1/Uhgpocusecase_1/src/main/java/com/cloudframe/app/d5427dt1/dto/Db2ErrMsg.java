package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Db2ErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class Db2ErrMsg extends Db2ErrMsgSerialized {
   

								@Getter @Setter private short db2ErrMsgLen;
      private List<char[]> db2ErrMsgText; 


								@Getter @Setter private int db2ErrMsgTextLen;

								@Getter @Setter private short iSub;
	
	/**
	* Constructor for Db2ErrMsg
	**/
    public Db2ErrMsg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDb2ErrMsgLen((short)780);
								setDb2ErrMsgTextLen(78);
    }





}
  
