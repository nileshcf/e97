package com.cloudframe.app.ar640010.dto;

/**
*  The class InUse340 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class InUse340 extends InUse340Serialized {
   

								@Getter @Setter private short copyAttempts340;
				@Getter @Setter private CopyIntervalGroup340 copyIntervalGroup340 = new CopyIntervalGroup340();

								@Getter @Setter private short deleteAttempts340;
				@Getter @Setter private DeleteIntervalGroup340 deleteIntervalGroup340 = new DeleteIntervalGroup340();

								@Getter @Setter private short copyAttemptsDft340;

								@Getter @Setter private long copyIntervalDft340;

								@Getter @Setter private short deleteAttemptsDft340;

								@Getter @Setter private long deleteIntervalDft340;
	
	/**
	* Constructor for InUse340
	**/
    public InUse340() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCopyIntervalGroup340().setParent(this,getStartOffset() + 2);
					getDeleteIntervalGroup340().setParent(this,getStartOffset() + 12);
	   	/*  end of offset */
								setCopyAttempts340((short)10);
								setDeleteAttempts340((short)15);
								setCopyAttemptsDft340((short)10);
								setCopyIntervalDft340(300L);
								setDeleteAttemptsDft340((short)15);
								setDeleteIntervalDft340(200L);
    }





}
  
