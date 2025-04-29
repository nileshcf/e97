package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501FileStatusRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip43501FileStatusRec extends Ip43501FileStatusRecSerialized { 
   

						@Getter @Setter private char[] ip43501FsRecType = Field.fillLowValue(2);

						@Getter @Setter private char[] ip43501FsTransmissionId = Field.fillLowValue(25);

						@Getter @Setter private char[] ip43501FsFileId = Field.fillLowValue(25);

								@Getter @Setter private int ip43501FsFileSeqNbr;

								@Getter @Setter private long ip43501FsInstitutionId;

								@Getter @Setter private long ip43501FsBin;

						@Getter @Setter private char[] ip43501FsCardAcceptor = Field.fillLowValue(15);

								@Getter @Setter private long ip43501FsSourceMsgNum;

						@Getter @Setter private char[] ip43501FsFiller = Field.fillLowValue(1);
				@Getter @Setter private Ip43501FsFileStatusInfo ip43501FsFileStatusInfo = new Ip43501FsFileStatusInfo();

	
	/**
	* Constructor for Ip43501FileStatusRec
	**/
    public Ip43501FileStatusRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip43501FileStatusRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501FileStatusRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp43501FsFileStatusInfo().setParent(this,getStartOffset() + 98);
    } 



}
  
