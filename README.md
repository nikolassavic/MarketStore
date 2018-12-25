# MarketStore

How to start the application

This console application is made in IntelliJ IDE but it should work in any IDE. To start it, import project to IDE, open Main class (which is located in ~\src\com\marketstore) and run the main method. Output data should appear in the console window.


How does the application work

In main method, there are card objects which are instances of card types and the value of previous month turn over is forwarded to them. A call of printBill method is also in the main method and instance of card type and purchase value are forwarded. The printBill method is located in Main class. Task for this method is to print results of discRate, discount and total methods. 

All this tree methods are static and located in abstract PayDesk class. Purchase value and discount rate are forwarded to disc method. Purchase value and discount are forwarded to total method. Object of the specific card is forwarded to discRate method. The discRate method calls getDiscRate method for the specific card.

The signature of getDiscRate method is located in Card class. The previous month turn over is forwarded to getDiscRate method. Logic for calculating discount rate is different for every type of the card, so this method's body is implemented in every subclass separately. That means that BronzeCard, SilverCard and GoldCard classes are subclasses of Card class.
