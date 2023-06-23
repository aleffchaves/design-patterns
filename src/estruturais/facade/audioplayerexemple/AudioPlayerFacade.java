package estruturais.facade.audioplayerexemple;

//
//Suponha que temos um sistema de reprodução de áudio com várias classes relacionadas, como Codec, Player, AudioFile, AudioMixer, etc.
//        Essas classes podem ser complexas e exigir uma configuração e chamadas de método específicas para reproduzir um arquivo de áudio.
//
//        Agora, vamos criar uma classe AudioPlayerFacade que atua como uma fachada para o subsistema de reprodução de áudio.
//        Essa classe fornecerá uma interface simples para os clientes reproduzirem um arquivo de áudio sem precisar lidar com
//        as complexidades internas.

//A classe AudioPlayerFacade encapsula as classes relacionadas e fornece os métodos play() e stop() para reproduzir e
//        parar um arquivo de áudio. Internamente, ela instancia as classes necessárias, configura-as adequadamente e
//        faz as chamadas necessárias para realizar a reprodução de áudio.
//
//        Os clientes podem usar a fachada AudioPlayerFacade para reproduzir um arquivo de áudio de maneira simples,
//        sem precisar entender as complexidades das classes subjacentes.

//public class AudioPlayerFacade {
//    private Codec codec;
//    private Player player;
//    private AudioFile audioFile;
//    private AudioMixer audioMixer;
//
//    public void play(String filename) {
//        audioFile = new AudioFile(filename);
//        codec = new Codec();
//        audioMixer = new AudioMixer();
//
//        codec.load(audioFile);
//        audioMixer.fix(codec);
//        player = new Player();
//        player.play(audioMixer);
//    }
//
//    public void stop() {
//        player.stop();
//    }
//}
