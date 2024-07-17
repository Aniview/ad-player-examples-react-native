import { StyleSheet, Text, View } from 'react-native';
import { requireNativeComponent } from 'react-native';

export const AdPlayerPlacementView = requireNativeComponent('AdPlayerPlacementView');

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.text}>React Native AdPlayer example:</Text>
      <AdPlayerPlacementView style={styles.placement}/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#000',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    color: '#fff',
  },
  placement: {
    width: "100%",
    flex: 1,
  },
});
