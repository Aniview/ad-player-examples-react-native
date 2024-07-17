import { StyleSheet, Text, View } from 'react-native';
import { requireNativeComponent } from 'react-native';

export const AdPlayerPlacementView = requireNativeComponent('AdPlayerPlacementView');

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.text}>React Native AdPlayer example:</Text>
      <View style={styles.placementParent}>
        <AdPlayerPlacementView style={styles.placement} />
      </View>
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
  placementParent: {
    width: "auto",
    alignSelf: 'baseline',
    margin: 32,
    padding: 4,
    backgroundColor: "red",
  },
  placement: {
    width: "100%",
    aspectRatio: 16 / 9,
  },
});
