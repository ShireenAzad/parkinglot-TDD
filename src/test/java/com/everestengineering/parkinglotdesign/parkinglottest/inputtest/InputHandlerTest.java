//package com.everestengineering.parkinglotdesign.parkinglottest.inputtest;
//
//import org.junit.jupiter.api.Test;
//
//public class InputHandlerTest {
//    @Test
//    public void printsMenusAndExits() throws Throwable {
//        String syote = "x\nx\n";
//        MockInOut io = new MockInOut(syote);
//        suorita(f(syote));
//
//        String[] menuRivit = {
//                "Airport panel",
//                "[1] Add airplane",
//                "[2] Add flight",
//                "[x] Exit",
//                "Flight service",
//                "[1] Print planes",
//                "[2] Print flights",
//                "[3] Print plane info",
//                "[x] Quit"
//        };
//
//        String output = io.getOutput();
//        String op = output;
//        for (String menuRivi : menuRivit) {
//            int ind = op.indexOf(menuRivi);
//            assertRight(menuRivi, syote, output, ind > -1);
//            op = op.substring(ind + 1);
//        }
//    }
//
//}
//
//
