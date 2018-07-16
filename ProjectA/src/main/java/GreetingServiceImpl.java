import com.example.projectB.GreetingServiceGrpc;

/**
 * Created by JacobAMason on 7/15/18.
 */
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greet(HelloRequest request, io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
        super.greet(request, responseObserver);
    }
}
