//package actions;
//import
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class InsertAndPrintDetailsHashMap {
//
//    private Map<String, PassengerTrain> passengerTrainHash;
//    private int numberOfRecords;
//
//    public void insertTrainRecords() {
//        try {
//            System.out.print("Enter the number of records for train details you want to provide : ");
//            Scanner input = new Scanner(System.in);
//            this.numberOfRecords = input.nextInt();
//
//            this.passengerTrainHash = new HashMap<>();
//
//            String trainName, trainNumber, originStation, destinationStation, engineType;
//            int numberOfCompartments, passengerCapacity;
//            double topSpeed;
//
//            for (int i = 0; i < this.numberOfRecords; i++) {
//
//                PassengerTrain passengerTrain = new PassengerTrain();
//
//                System.out.println("------------Taking input for record :" + (i + 1) + "-----------------");
//
//                System.out.print("Enter the Train Name : ");
//                trainName = input.next();
//                passengerTrain.setTrainName(trainName);
//                System.out.print("Enter the Train number : ");
//                trainNumber = input.next();
//                passengerTrain.setTrainNumber(trainNumber);
//                System.out.print("Enter the top speed for train : ");
//                topSpeed = input.nextDouble();
//                passengerTrain.setTopSpeed(topSpeed);
//                System.out.print("Enter the Origin station for the train : ");
//                originStation = input.next();
//                passengerTrain.setOriginStation(originStation);
//                System.out.print("Enter the Destination station for the train : ");
//                destinationStation = input.next();
//                passengerTrain.setDesitnationStation(destinationStation);
//                System.out.print("Enter the engine type for the train :  ");
//                engineType = input.next();
//                passengerTrain.setEngineType(engineType);
//                System.out.print("Enter the passengers capacity for the train : ");
//                passengerCapacity = input.nextInt();
//                passengerTrain.setPassengersCapacity(passengerCapacity);
//                System.out.print("Enter the number of compartments : ");
//                numberOfCompartments = input.nextInt();
//                passengerTrain.setTotalNumberOfCompartments(numberOfCompartments);
//
//                System.out.println("-------------End of record :" + (i + 1) + "-----------------");
//                System.out.println();
//                this.passengerTrainHash.put(passengerTrain.getTrainNumber(), passengerTrain);
//            }
//        } catch (InputMismatchException ex) {
//            System.out.println("Please enter a valid input");
//            System.out.println("Exception was thrown with error details : " + ex.getStackTrace().toString());
//            passengerTrainHash = new HashMap<>();
//        } catch (Exception ex) {
//            System.out.println("Unknown exception was thrown with error details : " + ex.getMessage());
//            passengerTrainHash = new HashMap<>();
//        }
//    }